def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        if image[sr][sc] == color: 
            return image
        self.fill(image, sr, sc, color, image[sr][sc])
        return image

def fill(self, image, sr, sc, prevColor, color):
    if sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]): 
        return
    if color != image[sr][sc]: 
        return
    image[sr][sc] = prevColor
    self.fill(image, sr-1, sc, prevColor, color)
    self.fill(image, sr+1, sc, prevColor, color)
    self.fill(image, sr, sc-1, prevColor, color)
    self.fill(image, sr, sc+1, prevColor, color)
