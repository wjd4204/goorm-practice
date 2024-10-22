import axios from "axios";

const API_BASE_URL = "http://localhost:8080/api";

class ApiService {
  fetchPosts() {
    return axios.get(`${API_BASE_URL}/post/all`);
  }
}

// export default new ApiService();
const apiServiceInstance = new ApiService();
export default apiServiceInstance;
