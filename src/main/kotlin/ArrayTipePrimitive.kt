fun main(args: Array<String>) {
    val x: IntArray = intArrayOf(1,2,3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ')}
    print('\n')

    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')

    val shortArray = ShortArray (5) {42}
    shortArray.forEach { print(it.toString() + ' ')}
    print('\n')

    val intArray = IntArray(5) { it * 1}
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}