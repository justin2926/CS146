## Approach used to solve
- How I went about this problem was by first counting the number of occurrences of each character and storing them in an array of size 128 which denotes ASCII characters. I also got rid of spaces and any non-alphanumerical characters. 
- Then I created a variable to store the length of the palindrome. 
- Next I iterated through the occurrences and added the biggest even number that is less than or equal to the length of the palindrome. If there's at least a character that has an odd number of currences, I'd add 1 to the length to represent the center of the palindrome. 
- Lastly, I'd return the length.