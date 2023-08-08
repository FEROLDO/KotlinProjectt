fun main(args: Array<String>) {
    var marks = 55
    var grade = if (marks<= 40){
        "E"
    }else if (marks<=50){
        "D"
    }else if (marks<=60){
        "C"
    }else if (marks<=70){
        "B"
    }else{
        "A"
    }
    println(grade)
}