package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data341RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data342RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data343RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data344RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data345RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data346RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data347RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data348RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data349RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data350RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen035ViewModel @Inject constructor(
    private val repo1: Data341RepositoryImpl,
    private val repo2: Data342RepositoryImpl,
    private val repo3: Data343RepositoryImpl,
    private val repo4: Data344RepositoryImpl,
    private val repo5: Data345RepositoryImpl,
    private val repo6: Data346RepositoryImpl,
    private val repo7: Data347RepositoryImpl,
    private val repo8: Data348RepositoryImpl,
    private val repo9: Data349RepositoryImpl,
    private val repo10: Data350RepositoryImpl,

): ViewModel() {
}
