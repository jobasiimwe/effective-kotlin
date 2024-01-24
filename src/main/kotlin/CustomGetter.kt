class CustomGetter() {

    var name: String = "Name"
    var surname: String = "Surname"
    val fulname
      get() = "$name $surname"
}