package main

import (
	"fmt"
	"math"
)

func prime() {
	// taking as int16

	flag := 1

	for i := 2; i <= math.MaxInt16; i++ {
		flag = 1
		for j := 2; j <= i/2; j++ {
			if i%j == 0 {
				flag++
				break
			}
		}
		if flag == 1 {
			fmt.Println(i)
		}
	}

}
