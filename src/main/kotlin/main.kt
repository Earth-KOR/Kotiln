fun main() {
    // var val 차이
    var number1 = 10L // long number1 = 10L
    number1 = 5L
    val number2 = 10L // final long number1 = 10L
    // number2 = 5L -> 에러발생

    // P.T -> 코틀린에서는 P.T R.T 둘다 표면상에서는 R.T으로 표시된다! 하지만 내부 구동시 코틀린이 적절하게 P.T으로 변환해서 사용한다.
    var number5 = 10L
    var numver6 = 1_000L

    // null 처리
    var number7 = 10L
    var number8: Long? = 1_00L
    number8 = null

    // 객체 생성
    //var person = Person("이름") -> java : Person person = new Person("이름")
}