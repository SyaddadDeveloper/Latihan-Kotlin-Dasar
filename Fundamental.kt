data class Mahasiswa(val name:String, var umur:Int, val status:Boolean)

fun main() {
    val TIB = arrayOf(
        Mahasiswa("Syaddad",20,true),
        Mahasiswa("maba1",20,true),
        Mahasiswa("maba2",22,true)
        )

    var counter:Int = 0
    while ( counter < TIB.size){
        println(TIB[counter])
        counter++
    }

    val nama: String = "Syaddad"
    var status: String = "Mahasiswa"
    var umur: Int = 20
    val IP1: Double = 3.93
    val IP2: Double = 3.5
    val IP3: Double = 3.6
    val IP4: Double = 4.0
    val IP5: Double = 3.2
    val IP6: Double = 3.7
    val IP7: Double = 3.9
    val IP8: Double = 3.4
    val IPK: Double = (IP1+IP2+IP3+IP4+IP5+IP6+IP7+IP8)/4
    mahasiswa(nama, status, umur, IPK)
}

fun mahasiswa(nama: String,status: String, umur: Int, IPK: Double) {
    if (status == "Mahasiswa" && (IPK > 3.5)){
        println("nama: $nama status: $status umur: $umur merupakan mahasiswa berprestasi")
    }else if(status == "lulus" && (IPK > 3.5)){
        println("nama $nama telah menjadi alumni berprestasi")
    }else if(status == "lulus"){
        println("nama $nama telah menjadi alumni")
    }else if(status == "tidak lulus" || (IPK < 1.5)){
        println("nama $nama telah dikeluarkan dari kampus")
    }

    //Numbers
    //Long (64bit)
    var longNumber1:Long = 1000
    var longNumber2 = 1000L

    //Double (64bit)
    var doubleNumber:Double = 0.534425

    //Int (32bit)
    var intNumber = 100

    //Float (32bit)
    var floatNumber:Float = 0.12345f

    //Short (16bit)
    var shortNumber: Short = 10

    //Byte (8bit)
    var byteNumber:Byte = 0b110100

    //Array
    val array1 = arrayOf(1,"kotlin", true)
    val array2 = intArrayOf(1,8,3,4,5)
    array2[1] = 2

    //null
    val nullVariable: String? = null
    if (nullVariable != null) {
        println(nullVariable)
    }


println(Color.RED.value)

}

    //enumeration

enum class Color(val value:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
