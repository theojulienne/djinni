// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from derivings.djinni

package com.dropbox.djinni.test;

public final class RecordWithNestedDerivings implements Comparable<RecordWithNestedDerivings> {


    /*package*/ final int mKey;

    /*package*/ final RecordWithDerivings mRec;

    public RecordWithNestedDerivings(
            int key,
            RecordWithDerivings rec) {
        this.mKey = key;
        this.mRec = rec;
    }

    public int getKey() {
        return mKey;
    }

    public RecordWithDerivings getRec() {
        return mRec;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RecordWithNestedDerivings)) {
            return false;
        }
        RecordWithNestedDerivings other = (RecordWithNestedDerivings) obj;
        return this.mKey == other.mKey &&
                this.mRec.equals(other.mRec);
    }

    @Override
    public int compareTo(RecordWithNestedDerivings other)  {
        int tempResult;
        if (this.mKey < other.mKey) {
            tempResult = -1;
        } else if (this.mKey > other.mKey) {
            tempResult = 1;
        } else {
            tempResult = 0;
        }
        if (tempResult != 0) {
            return tempResult;
        }
        tempResult = this.mRec.compareTo(other.mRec);
        if (tempResult != 0) {
            return tempResult;
        }
        return 0;
    }
}
