        org     100h

        mov     ax, 84AFh
        mov     bh, 5Dh

        mov cl, "I"
        mov [213h], cl


        mov cl, "A"
        mov [216h], cl
        mov cl, "M"
        mov [217h], cl

        mov cl, "A"
        mov [21Ah], cl

        mov cl, "P"
        mov [222h], cl
        mov cl, "O"
        mov [223h], cl
        mov cl, "R"
        mov [224h], cl
        mov cl, "K"
        mov [225h], cl

        mov cl, "C"
        mov [228h], cl
        mov cl, "U"
        mov [229h], cl
        mov cl, "T"
        mov [22Ah], cl
        mov cl, "L"
        mov [22Bh], cl
        mov cl, "E"
        mov [22Ch], cl
        mov cl, "T"
        mov [22Dh], cl

        mov cl, "B"
        mov [232h], cl
        mov cl, "O"
        mov [233h], cl
        mov cl, "W"
        mov [234h], cl
        mov cl, "L"
        mov [235h], cl

        mov cl, "F"
        mov [238h], cl
        mov cl, "A"
        mov [239h], cl
        mov cl, "T"
        mov [23Ah], cl
        mov cl, "A"
        mov [23Bh], cl
        mov cl, "L"
        mov [23Ch], cl
        mov cl, "E"
        mov [23Dh], cl

        mov cl, "T"
        mov [245h], cl
        mov cl, "H"
        mov [246h], cl
        mov cl, "A"
        mov [247h], cl
        mov cl, "T"
        mov [248h], cl

        mov cl, "E"
        mov [252h], cl
        mov cl, "N"
        mov [253h], cl
        mov cl, "T"
        mov [254h], cl
        mov cl, "H"
        mov [255h], cl
        mov cl, "R"
        mov [256h], cl
        mov cl, "A"
        mov [257h], cl
        mov cl, "L"
        mov [258h], cl
        mov cl, "L"
        mov [259h], cl
        mov cl, "S"
        mov [25Ah], cl

        mov cl, "M"
        mov [265h], cl
        mov cl, "E"
        mov [266h], cl
        mov cl, "N"
        mov [267h], cl

        int 20h