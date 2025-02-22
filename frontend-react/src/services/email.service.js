import { customAxios } from "./helper";


export async function sendEmail(emaildata) {
    const data = (await customAxios.post(`/email/send`, emaildata)).data;
    return data;
}

export async function sendEmailWithFile(emaildata) {
    const data = (await customAxios.post(`/email/send-with-file`, emaildata)).data
    return data;
}