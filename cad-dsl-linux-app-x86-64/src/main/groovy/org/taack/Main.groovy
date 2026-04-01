package org.taack

import static org.taack.cad.dsl.CadDsl.cd

static void main(String[] args) {
    println "Hello world!"

    cd().box(10, 10, 10).display()
}