
//Question3
fun noOfOccurrences(s: String, ch: Char): Int {
    return s.filter { it == ch }.count()
}

    fun main(args: Array<String>) {

        var str = "Akash Shekhawat living in uttar pradesh"
        val oldValue = "Akash Shekhawat"
        val newValue = "Aashutosh"

        val output = str.replace(oldValue, newValue, ignoreCase = true)
        println("Initial String: " + str)
        println("String after replace: " + output)


        //Q3
        val s1="miny"
        val s = "Eeny has 6 balls, meeny has 4 toys, miny has 20 chocolate, moe has 4 grapes"
        println(noOfOccurrences(s, 'e'))

        //Q4
        val result = s.filter({ it -> it.isDigit() }).count()
        println("Filtered String by digit : " + result)

        val result1 = s.filter({ it -> it.isLetter() }).count()
        println("Filtered String by letter : " + result1)

        val result2 = s.filter({ it -> it.isUpperCase() }).count()
        println("Filtered String  by Upper Case: " + result2)

        val result3 = s.filter({ it -> it.isLowerCase() }).count()
        println("Filtered String  by Lower Case: " + result3)




            //Question 5

            val arr1 = intArrayOf(4, 7, 3, 9, 2)
            val arr2 = intArrayOf(3, 2, 12, 9, 40, 32, 4)
            for (i in arr1.indices) {
                for (j in arr2.indices) {
                    if (arr1[i] == arr2[j]) {
                        print(" ")
                        print(arr1[i])
                    }
                }
            }

        println(" ")
        println(s.contains(s1))
    }