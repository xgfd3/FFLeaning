cmake_minimum_required(VERSION 3.4.1)

#共用的编译参数
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -O3 -Wall -pipe -ffast-math -fstrict-aliasing -Werror=strict-aliasing")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wno-asm -Wa,--noexecstack -DANDROID -DNDEBUG")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fexceptions -frtti -std=c++11")

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -O3 -Wall -pipe -ffast-math -fstrict-aliasing -Werror=strict-aliasing")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wno-asm -Wa,--noexecstack -DANDROID -DNDEBUG")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -std=c99")

# 输出更详细的构建信息
SET(CMAKE_VERBOSE_MAKEFILE on)

# 声明依赖的模块
add_subdirectory(./ffmpeg)



