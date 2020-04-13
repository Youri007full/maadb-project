plugins {
    id("maadb-project-plugin")
    kotlin("plugin.serialization")
}

kotlin.sourceSets["jvmMain"].dependencies {

    val kMongoVersion: String by project
    val kBsonVersion: String by project

    api(project(":core"))
    api("org.litote.kmongo:kmongo:$kMongoVersion")
    api("org.litote.kmongo:kmongo-coroutine:$kMongoVersion")
    api("com.github.jershell:kbson:$kBsonVersion")

}
