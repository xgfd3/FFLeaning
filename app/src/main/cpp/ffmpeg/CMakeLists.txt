cmake_minimum_required(VERSION 3.4.1)

# 头文件
include_directories( ${CMAKE_SOURCE_DIR}/ffmpeg/include )

# 静态库
set(static_libs_dir ${CMAKE_SOURCE_DIR}/ffmpeg/libs)
link_directories(${static_libs_dir}/${ANDROID_ABI})
set(third-party-libs
        avformat
        avcodec
        avfilter
        swresample
        swscale
        avutil)
set(native-libs z)

# 编译成动态库
set(lib_name learn-ffmpeg)
add_library(${lib_name} SHARED test.cpp)
target_link_libraries(${lib_name} ${third-party-libs} ${native-libs})

