output "ec2_id" {
  value = aws_instance.EC2_Instance.id
}
output "ec2_ami" {
  value = aws_instance.EC2_Instance.ami
}
output "ec2_instanceType" {
  value = aws_instance.EC2_Instance.instance_type
}
output "ec2_AZ" {
  value = aws_instance.EC2_Instance.availability_zone
}