

fun main() {
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
}
