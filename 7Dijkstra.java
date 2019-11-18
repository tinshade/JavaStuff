package dijkstra;
import java.util.Scanner;
public class Dijkstra{
    public static int V = 5;
    public static int minDistance(int dist[], Boolean[] visited){
        int min = Integer.MAX_VALUE, min_index = -1;
        for(int v =0; v<V; v++){
            if(visited[v] == false && dist[v]<=min){
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }
    public static void printSolution(int dist[], int V){
        System.out.println("Vertex\t\tDistance from Source");
        for(int v=0; v<V; v++){
            System.out.println(v+"\t\t"+dist[v]);
        }
    }
    public static void dijkstra(int graph[][], int src){
        int dist[] = new int[V];
        Boolean[] visited = new Boolean[V];
        for(int i=0;i<V;i++){
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        dist[src] = 0;
        for(int count=0; count<V-1; count++){
            int u = minDistance(dist,visited);
            visited[u] = true;
            
            for(int v=0;v<V;v++){
                if(!visited[v] && graph[u][v]!=0 && dist[u]+graph[u][v]<dist[v] && dist[u]!=Integer.MAX_VALUE){
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        printSolution(dist, V);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        V = s.nextInt();
        int graph[][] = new int [V][V];
        System.out.println("Enter the distance of each vertex");
        for(int i=0; i<V;i++){
            for(int j=0;j<V;j++){
                graph[i][j] = s.nextInt();
            }
        }
        Dijkstra o = new Dijkstra();
        o.dijkstra(graph, 0);
    }
}