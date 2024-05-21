class Instance(
    val id: InstanceId
) {
    constructor(instance:dynamic):this(instance.id)

    operator fun get(key: String): dynamic {
        return variable_instance_get(id, key)
    }
}

operator fun InstanceId.get(key: String): dynamic {
    return variable_instance_get(this, key)
}