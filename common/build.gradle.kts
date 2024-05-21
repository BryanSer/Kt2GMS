plugins {
    kotlin("multiplatform") version "1.9.24"
}

group = "com.github.bryanser"

repositories {
    mavenCentral()
}
kotlin{
    js(IR){
        browser {
            binaries.executable()
            webpackTask{
            }
        }

    }
}