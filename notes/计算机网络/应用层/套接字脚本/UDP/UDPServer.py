from socket import *
serverPort = 12001
serverSocket = socket(AF_INET, SOCK_DGRAM)
serverSocket.bind(('',serverPort))
print("The server is ready to receive")
while True:
    message, clientAddress = serverSocket.recvfrom(2048)
    modifiedMessage = message.decode().upper()
    print(message)
    serverSocket.sendto(modifiedMessage.encode(), clientAddress)
    # message_me = input('输入任意字符继续')
    # if ( message_me == " " ):
    #     break