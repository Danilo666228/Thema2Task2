import kotlin.random.Random

fun main() {
    val array = arrayOf(
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(9, 8, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )
//    val rows = readln().toInt()
//    val colums = readln().toInt()
//    val array = Array(rows){IntArray(colums)}
//
//    var random = Random
//
//    for(i in 0 until rows){
//        for(j in 0 until colums){
//            array[i][j] = random.nextInt(11)
//        }
//    }
//    for (i in array){
//        for(j in i){
//            print("$j\t")
//        }
//        println()
//    }

    val n = array.size
    var isSymmetric = true

    for (i in 0 until n) {
        for (j in 0 until n) {
            // Проверка, что элементы несимметричны относительно главной диагонали
            if (array[i][j] != array[j][i]) {
                isSymmetric = false
                break
            }
        }
    }

    if (isSymmetric) {
        println("Массив является симметричным относительно главной диагонали")
    } else {
        println("Массив не является симметричным относительно главной диагонали")
    }
}