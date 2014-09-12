// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from derivings.djinni

#pragma once

#include "djinni_support.hpp"
#include "record_with_nested_derivings.hpp"

namespace djinni_generated {

class NativeRecordWithNestedDerivings final {
public:
    using CppType = RecordWithNestedDerivings;
    using JniType = jobject;

    static jobject toJava(JNIEnv*, RecordWithNestedDerivings);
    static RecordWithNestedDerivings fromJava(JNIEnv*, jobject);

    const djinni::GlobalRef<jclass> clazz { djinni::jniFindClass("com/dropbox/djinni/test/RecordWithNestedDerivings") };
    const jmethodID jconstructor { djinni::jniGetMethodID(clazz.get(), "<init>", "(ILcom/dropbox/djinni/test/RecordWithDerivings;)V") };
    const jfieldID field_mKey { djinni::jniGetFieldID(clazz.get(), "mKey", "I") };
    const jfieldID field_mRec { djinni::jniGetFieldID(clazz.get(), "mRec", "Lcom/dropbox/djinni/test/RecordWithDerivings;") };

private:
    NativeRecordWithNestedDerivings() {}
    friend class djinni::JniClass<NativeRecordWithNestedDerivings>;
};

}  // namespace djinni_generated