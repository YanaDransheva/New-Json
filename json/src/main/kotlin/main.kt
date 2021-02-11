import kotlinx.serialization.*
import kotlinx.serialization.json.*


@Serializable
data class Parametres(val objectUin: String)

@Serializable
data class MyModel(val id: Int, val jsonRpc: String, val method: String, val params: Parametres)

fun main() {
    fun getResourceAsText(path: String): String {
        return object {}.javaClass.getResource(path).readText()
    }
    val json = getResourceAsText("C:\\Users\\dransheva\\Desktop\\json\\jsonParse.json")
    // Serializing objects


    // parsing data back
    val obj = JSON.parse(MyModel.serializer(), json)
    println(obj) // MyModel(a=42, b="42")

//    val string =  json
//    println(string) // {"name":"kotlinx.serialization","language":"Kotlin"}
//    // Deserializing back into objects
//    val obj = Json.decodeFromString<Project>(string)
//
//    println(obj) // Project(name=kotlinx.serialization, language=Kotlin)
//    val s = obj as Project
//    println("Name "+ s.name)
//    println("language " + s.language)



}