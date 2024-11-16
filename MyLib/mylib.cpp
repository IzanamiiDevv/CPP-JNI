#include <iostream>
#include "MyLib_mylib.h"

extern "C" {

JNIEXPORT void JNICALL Java_MyLib_mylib_print(JNIEnv *env, jobject, jstring txt) {
    const char* nativeString = env->GetStringUTFChars(txt, nullptr);
    std::cout << nativeString << std::endl;
    env->ReleaseStringUTFChars(txt, nativeString);
}


JNIEXPORT jint JNICALL Java_MyLib_mylib_add(JNIEnv *, jobject, jint a, jint b) {
    return a + b;
}

}