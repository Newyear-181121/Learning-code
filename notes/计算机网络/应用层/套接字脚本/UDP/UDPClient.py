from socket import *
serverName = "192.168.100.76"
serverPort = 12001
clientSocket = 12000
clientSocket = socket(AF_INET, SOCK_DGRAM)
while True:
    message = input('Input lowercase setence:')
    clientSocket.sendto(message.encode(),(serverName, serverPort))
    modifiedMessage, serverAddress = clientSocket.recvfrom(2048)
    print(modifiedMessage.decode(),serverAddress)
clientSocket.close()