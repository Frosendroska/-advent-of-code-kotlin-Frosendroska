fun main() {
    fun part1(input: List<String>): Int {
        var max = 0
        var cur = 0
        for (i in input.indices) {
            if (input[i].isNotEmpty()) {
                cur += Integer.parseInt(input[i])
                max = Math.max(max, cur)
            } else {
                cur = 0
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        val arr = mutableListOf<Int>()
        arr.add(0)
        var cur = 0
        var max = 0
        for (i in input.indices) {
            if (input[i].isNotEmpty()) {
                cur += input[i].toInt()
            } else {
                arr.add(cur)
                cur = 0
            }
        }
        arr.sortDescending()
        for (i in 0 .. 2) {
            max += arr[i]
        }
        return max
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
