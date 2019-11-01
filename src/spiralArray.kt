package arrayExercise

fun main(args:Array<String>) {
    println("Enter the number of columns of array :")
    var n =	readLine()!!.toInt()
    val spiralArray = Array<IntArray>(n, {IntArray(n)})
    var value = 1
    var firstCol = 0
    var lastCol = n - 1
    var firstRow = 0
    var lastRow = n - 1

    while (value <= n * n)
    {
        for (i in firstCol..lastCol)
        {
            value = addValueToArray(firstRow,i,value,spiralArray)
        }
        for (i in firstRow + 1..lastRow)
        {
            value = addValueToArray(i,lastCol,value,spiralArray)
        }
        for (i in lastCol - 1 downTo firstCol)
        {
            value = addValueToArray(lastRow,i,value,spiralArray)
        }
        for (i in lastRow - 1 downTo firstRow + 1)
        {
            value = addValueToArray(i,firstCol,value,spiralArray)
        }
        firstCol++
        firstRow++
        lastCol--
        lastRow--
    }
    
    for (i in spiralArray.indices)
    {
        for (j in spiralArray.indices)
        {
            print(spiralArray[i][j])
            print(" ")
        }
        println()
    }

}

fun addValueToArray(row: Int,column: Int, value: Int, spiralArray: Array<IntArray> ): Int{
    var valueInArray = value
    spiralArray[row][column] = valueInArray
    return (valueInArray+1)
}
