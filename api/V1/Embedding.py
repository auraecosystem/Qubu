import axios from 'axios'

const options = {
  method: 'POST',
  url: 'https://qubu.ai/api/v1/embeddings',
  headers: {
    'Content-Type': 'application/json',
    Authorization: 'Bearer d369192cb0dc2c4fbba6c17d153fbaeb5056a9c1\n'
  },
  data: {
    input: 'hello, world',
    model: 'text-embedding-3-small',
    encoding_format: 'float'
  }
}

try {
  const { data } = await axios.request(options)
  console.log(data)
} catch (error) {
  console.error(error)
}
