//
// DON'T EDIT! This file is GENERATED by `MppJpsIncTestsGenerator` (runs by generateTests)
// from `incremental/multiplatform/multiModule/simple/dependencies.txt`
//

actual fun c_platformDependentC(): String = "pJvm"
fun pJvm_platformOnly() = "pJvm"

fun pJvmTest() {
  c_platformIndependentC()
  c_platformDependentC()
  pJvm_platformOnly()
  JavaClass().doStuff()
}
