package burp
import java.io.PrintWriter

@Suppress("unused")
class BurpExtender : IBurpExtender {
    override fun registerExtenderCallbacks(callbacks: IBurpExtenderCallbacks?) {
        val stdout = PrintWriter(callbacks?.stdout, true)
        val stderr = PrintWriter(callbacks?.stderr, true)

        callbacks?.setExtensionName("Kotlin Extension starter")
        stdout.println("Hello World!")
        stderr.println("Hello World!")
    }

}
