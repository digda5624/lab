import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test

class ObjectMapperTest {

    @Test
    fun test() {
        val objectMapper = ObjectMapper()

        val value = objectMapper.writeValueAsString(mutableMapOf("plain" to emptyMap<String, String>()))

        print(value)
    }

}
