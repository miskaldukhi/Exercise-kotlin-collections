fun main(){
   val countryNames = mutableMapOf("USA" to "Washington", "France" to "Paris",
       "Germany" to "Berlin")

    countryNames["Kuwait"]="Kuwait City"
    countryNames.remove("Germany")
    println("Countries: ${countryNames.keys}")
    println( "Capitals: ${countryNames.values}")



}




