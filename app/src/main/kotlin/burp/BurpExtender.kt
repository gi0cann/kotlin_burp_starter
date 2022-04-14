package burp
import java.io.PrintWriter

@Suppress("unused")
class BurpExtender : IBurpExtender {
    override fun registerExtenderCallbacks(callbacks: IBurpExtenderCallbacks?) {
        val stdout = PrintWriter(callbacks?.stdout ?: null, true)
        val stderr = PrintWriter(callbacks?.stderr ?: null, true)

        callbacks?.setExtensionName("My Addon")
        stdout.println("Hello World!")
        stderr.println("Hello World!")
    }

}