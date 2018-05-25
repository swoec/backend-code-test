# libthedrawer2018-0.6.4

You are given a 3rd party vendor library called `libthedrawer2018-0.6.4`. Its purpose is to render images in a proprietary graphical format.


The library is a black-box that communicates with a 3rd party server which performs rendering and leaves the final image file on a vendor's server for later use.


The library API is a single function `int draw_lines(int[][][]);`. You may use only this function through FFI from any language of your preference.


No need to write FFI integration, instead you may simply print out the input data in your version of `draw_lines` function.

`libthedrawer2018-0.6.4` API is a single function `int draw_lines(int[][][]);` which receives a 3 level nested array of integers and return an ID of the image.

The function argument is of the following structure:
 - 1st level is the list of lines to be drawn on a canvas
 - 2nd level is the list of 2 points for each line on the canvas
 - 3rd level is the list of coordinates for each point on the 2D canvas

Your goals are:
 - to write your own library for drawing shapes around that single function
 - keep in mind that the library is supposed to be used later by other developers in many different projects for many years
 - the first version of the library needs to be able to draw following shapes: Square, Rectangle


Recommended time: 2 - 3 hours

