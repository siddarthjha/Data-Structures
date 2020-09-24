 
#include <stdio.h> 

// Function to swap odd and even bits
unsigned int swapBits(unsigned int x) 
{ 
	unsigned int even_bits = x & 0xAAAAAAAA; // Even bits 
	unsigned int odd_bits = x & 0x55555555; // Odd bits
	even_bits >>= 1; // Right shift even bits 
	odd_bits <<= 1; // Left shift odd bits 
	return (even_bits | odd_bits); // Combine even and odd bits 
} 

 
int main() 
{ 
	unsigned int x = 23; // 00010111 
	printf("%u ", swapBits(x)); 
	return 0; 
} 

