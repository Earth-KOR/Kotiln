package chapter2

import java.lang.IllegalArgumentException

class chapter2 {

    // java 코드
//    public boolean startsWithA2(String str) {
//        if (str == null) {
//            return false;
//        }
//        return str.startsWith("A")
//    }

    fun stringsWithA1(str: String?): Boolean {
        if(str == null) {
            return false
        }
        return str.startsWith("A")

        // 코틀린에서는 null이 가능한 타입을 완전히 다르게 취급한다!

        // Safe Call
        val str2: String? = "ABC"
        str2.length
        // str2가 Null 이면 0으로 반환한다.
        str2?.length ?: 0
    }

    fun startsWith(str: String?): Boolean {
        // 무조건 null!! 강조 하지만 null이 들어오면 NPE 뱉어냄
        return str!!.startsWith("A")
    }

    //Java에서 사용하는 null 관련 어노테이션을 인식한다 -> 만약에 이런 어노테이션이 없다 -> 플랫폼 타입 -> 실행시 NPE 날수도 있음
}