import java.util.*

class BinarySearchKotlin {
    object BinarySearch {
        @JvmStatic
        fun main(args: Array<String>) {
            val sc = Scanner(System.`in`)
            println("Enter the size of the array ?")
            val n = sc.nextInt()
            println("Enter the numbers in sorted order ...")
            val a = IntArray(n)
            var prev = Int.MIN_VALUE
            try {
                for (i in 0 until n) {
                    a[i] = sc.nextInt()
                    if (a[i] < prev) throw UnsortedArrayException("You entered an element that does'nt follows the sorted order ! Try Again.")
                    prev = a[i]
                }
            } catch (e: UnsortedArrayException) {
                e.printStackTrace()
                System.exit(0)
            }
            println("Enter the element to be searched ?")
            val key = sc.nextInt()
            val indexFound = recBinarySearch(a, 0, n - 1, key)
            if (indexFound == -1) println("$key not found ") else println("$key found at position $indexFound")
        }

        private fun itrBinarySearch(a: IntArray, i: Int, j: Int, key: Int): Int {
            var i = i
            var j = j
            while (i <= j) {
                val mid = i + (j - i) / 2
                if (a[mid] == key) return mid else if (a[mid] > key) j = mid - 1 else i = mid + 1
            }
            return -1
        }

        private fun recBinarySearch(a: IntArray, i: Int, j: Int, key: Int): Int {
            if (i > j) return -1
            val mid = i + (j - i) / 2
            return if (a[mid] == key) mid else if (a[mid] > key) recBinarySearch(
                a,
                i,
                mid - 1,
                key
            ) else recBinarySearch(a, mid + 1, j, key)
        }
    }

    internal class UnsortedArrayException(s: String?) : Exception(s)
}