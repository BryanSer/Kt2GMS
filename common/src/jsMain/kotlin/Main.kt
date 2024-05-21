import kotlinx.browser.window

@OptIn(ExperimentalJsExport::class)
@JsExport
fun registerMethod(name:String, method: dynamic){
    console.log("name: $name, method: $method")
    js("window.reg_abs = method")
}

@OptIn(ExperimentalJsExport::class)
@JsExport
fun checkExists(instance: dynamic, name: String){
    val instance = Instance(instance)
    window.alert("instanceId: ${instance.id}, name:$name, exists: ${variable_instance_exists(instance.id, name)}")
}

fun main() {
    console.log("init kt2gms-common")
    js("window.registerMethod = _.registerMethod;")
    js("window.checkExists = _.checkExists;")
}
