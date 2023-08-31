@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.cocoapods)
    alias(libs.plugins.sqlDelight)
    alias(libs.plugins.mapsplatform.secrets)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_17.toString()
            }
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        version = "1.0.0"
        summary = "Compose application framework"
        homepage = "empty"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")

        framework {
            baseName = "ComposeApp"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.coroutines.core)
                implementation(libs.kotlin.datetime)
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
                implementation(libs.koin.core)
                implementation(libs.sqlDelight.extensions)
                implementation(libs.settings)
                implementation(libs.voyager.navigator)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.kotlin.coroutines.android)
                implementation(libs.android.appcompat)
                implementation(libs.android.camera.camera2)
                implementation(libs.android.camera.lifecycle)
                implementation(libs.android.camera.view)
                implementation(libs.compose.uitooling)
                implementation(libs.compose.activity)
                implementation(libs.compose.accompanist.permissions)
                implementation(libs.compose.maps)
                implementation(libs.google.material)
                implementation(libs.google.playservices.maps)
                implementation(libs.google.playservices.location)
                implementation(libs.google.mlkit.barcode)
                implementation(libs.google.zxing)
                implementation(libs.koin.android)
                implementation(libs.sqlDelight.driver.android)
            }
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
            dependencies {
                implementation(libs.sqlDelight.driver.native)
            }
        }

        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "uz.javokhir.kqr.master"
    compileSdk = 34

    defaultConfig {
        applicationId = "uz.javokhir.kqr.master"
        minSdk = 24
        versionCode = 1
        versionName = "1.0.0"
    }

    sourceSets["main"].apply {
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
        res.srcDirs("src/androidMain/resources")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    packaging {
        resources.excludes.add("META-INF/**")
    }
}

sqldelight {
  databases {
    create("AppDatabase") {
      // Database configuration here.
      // https://cashapp.github.io/sqldelight
      packageName.set("uz.javokhir.kqr.master.db")
    }
  }
}

secrets {
    defaultPropertiesFileName = "default.local.properties"
    propertiesFileName = "local.properties"
}
