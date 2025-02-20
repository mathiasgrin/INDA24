
def bfs(start_v, g):
    visited = [False] * len(g)
    prev = [None] * len(g)
    q = []
    q.append(start_v)
    visited[start_v] = True
    
    while q:
        curr_v = q.pop(0)
        neighbors = g[curr_v]
        for n in neighbors:
            if not visited[n]:
                q.append(n)
                visited[n] = True 
    return prev

def get_path(start, end, bfs_res):

                  
def shortest_path(start, end, g):
    bfs_path = bfs(start, g)
    return get_path(start, end, bfs_path)
    
    
    
# Programmet körs härifrån
g = {
    0: [1, 4],
    1: [0, 4, 2],
    2: [1, 3],
    3: [2, 4, 5],
    4: [0, 1, 3],
    5: [3]
}
print(shortest_path(0, 5, g))


