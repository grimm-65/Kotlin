fun  main(){

//    fun convert(n: Int): String{
//
//        if(n%3 == 0){
//            println("Pling")
//        }else if(n%5 == 0){
//            println("Plang")
//        }else if(n%7 == 0){
//            println("Plong")
//        }else{
//
//             println(n.toString())
//        }
//        return n.toString()
//
//    }
//
//    convert(105)

    fun convert(n: Int): String = buildString {

        if(n%3 == 0) append("pling")
        if(n%5 == 0) append("plang")
        if(n%7 == 0) append("plong")

        if(isEmpty()) append(n)
    }

    convert(4)
}