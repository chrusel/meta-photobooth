#include <iostream>

#include "hello.h"


void hello() {
    #ifdef NDEBUG
    std::cout << "Hello Photobooth Release!" <<std::endl;
    #else
    std::cout << "Hello Photobooth Debug!" <<std::endl;
    #endif
}
