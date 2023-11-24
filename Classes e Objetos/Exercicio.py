class Rectangle:
  def __init__(self, width, height):
    self.width = width
    self.height = height
  
  def area(self):
    return self.width * self.height

  def perimeter(self):
    return self.width*2 + self.height*2
    
square = Rectangle(4,4)
print(square.area()) # 16
print(square.perimeter()) #16