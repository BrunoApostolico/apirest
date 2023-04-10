variable "region" {
  type        = string
  default     = "us-east-1"
  description = "Indica a Zona de Disponibilidade em que o recurso será criado dentro da AWS"
}

variable "imageId" {
  type        = string
  default     = "ami-007855ac798b5175e"
  description = "Identificador da imagem que será utilizada durante a criação de instancias EC2. Padrão Ubuntu"
}

variable "instanceType" {
  type        = string
  default     = "t2.micro"
  description = "Tipo de máquina EC2 que sera criada na AWS"
}