import org.junit.jupiter.api.Test

internal class CustomGetterTest {

    @Test
    fun test_CustomeGetter() {
        val customGetter = CustomGetter()
        println(customGetter.fulname)
        customGetter.surname = "Blah"
        println(customGetter.fulname)
    }

}