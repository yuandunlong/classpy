package com.github.zxh.classpy.dexfile.datatype;

import com.github.zxh.classpy.common.IntValue;
import com.github.zxh.classpy.dexfile.DexComponent;
import com.github.zxh.classpy.dexfile.DexReader;

/**
 *
 * @author zxh
 */
public class UByte extends DexComponent implements IntValue {

    private int value;

    @Override
    public int getValue() {
        return value;
    }
    
    @Override
    protected void readContent(DexReader reader) {
        value = reader.readUnsignedByte();
        describe(value);
    }
    
    protected void describe(int value) {
        setDesc(value);
    }
    
}
