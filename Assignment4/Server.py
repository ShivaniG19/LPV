import time
import socket

SERVER_ADD ="127.0.0.1"
SERVER_PORT=8080

def handle_client(client_socket):
    server_time=str(time.time()).encode()
    client_socket.send(server_time)


def creat_socket():
    server_socket= socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    server_socket.bind((SERVER_ADD,SERVER_PORT))
    server_socket.listen(1)
    print("server is listing from {}:{}".format(SERVER_ADD,SERVER_PORT))
    

    while True:
        client_socket,client_add=server_socket.accept()
        handle_client(client_socket)
        print("Client is Connected from {}:{}".format(client_add[0],client_add[1]))
        client_socket.close()

creat_socket()

