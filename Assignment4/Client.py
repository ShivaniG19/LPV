import time
import socket

SERVER_ADD ="127.0.0.1"
SERVER_PORT=8080

def req_from_client():
    client_socket=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    client_socket.connect((SERVER_ADD,SERVER_PORT))
    server_time=client_socket.recv(1024)
    client_socket.close()
    return float (server_time)


clock_skews=[]
def clock_sync(client):
    print("client",client,"sending the request")
    server_time=req_from_client()
    local_time=time.time()
    clock_skew=abs(local_time-server_time)
    clock_skews.append(clock_skew)






client=4
cnt=0
 
while cnt<client:
    clock_sync(client)
    cnt=cnt+1
    time.sleep(2)

adjusted_time=sum(clock_skews)/len(clock_skews)
print("Avg time ",adjusted_time)
print("Adjusted time ",((time.time())+adjusted_time))
