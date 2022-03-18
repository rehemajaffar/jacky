fun main(){
    var product=product(arrayOf(34,56,78))
    println(product)
    var sum=sum(arrayOf(4,34,1.0,true,"Rehema"))
    println(sum)
    var characters=(arrayOf("a","b","c","d","e","f"))
    println(characters)

}
fun product(num:Array<Int>):Int{
    var product =1
    num.forEach { num->
        product*=num
    }
    return product

}
fun sum(digits:Array<Any>):Double{
    var sum =0.0
    digits.forEach { digits ->
        if (digits is Double){
            sum += digits
        }

    }
    return sum

}fun Characters(mixedcharacters:Array<Char>):Int {
    var total = 0
    mixedcharacters.forEach { line ->
        if (line== 'a' || line == 'b' || line == 'c' || line == 'd' || line == 'e') {
            total++
        }

    }
    return total

}
