resource "aws_instance" "EC2_Instance" {
  instance_type = var.instanceType
  ami           = var.imageId
  tags = {
    Name = "projetoinfnet"
  }
}